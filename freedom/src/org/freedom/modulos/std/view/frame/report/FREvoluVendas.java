/**
 * @version 08/12/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Anderson Sanchez <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.std <BR>
 *         Classe:
 * @(#)FREvoluVendas.java <BR>
 * 
 *                        Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *                        modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *                        na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *                        Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *                        sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *                        Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *                        Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *                        de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *                        Tela de op��es para o gr�fico de evolu��o de vendas.
 * 
 */

package org.freedom.modulos.std.view.frame.report;

import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.layout.graphics.EvoluVendasBarras;
import org.freedom.layout.graphics.EvoluVendasLinha;
import org.freedom.library.functions.Funcoes;
import org.freedom.library.persistence.GuardaCampo;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JCheckBoxPad;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JRadioGroup;
import org.freedom.library.swing.component.JTextFieldFK;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.library.swing.frame.FPrinterJob;
import org.freedom.library.swing.frame.FRelatorio;
import org.freedom.library.type.TYPE_PRINT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.BorderFactory;

import org.freedom.bmps.Icone;

public class FREvoluVendas extends FRelatorio {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private JTextFieldPad txtDatafim = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );

	private FPrinterJob dl = null;

	private JRadioGroup<?, ?> rgGrafico = null;

	private Vector<String> vLabs = new Vector<String>( 2 );

	private Vector<String> vVals = new Vector<String>( 2 );

	private JTextFieldPad txtCodTipoCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtDescTipoCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private ListaCampos lcTipoCli = new ListaCampos( this, "TI" );

	private JTextFieldPad txtCodCli = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldFK txtRazCli = new JTextFieldFK( JTextFieldPad.TP_STRING, 60, 0 );

	private ListaCampos lcCli = new ListaCampos( this, "TI" );

	private JCheckBoxPad cbVendas = new JCheckBoxPad( "S� vendas?", "S", "N" );
	
	private JRadioGroup<?, ?> rgEmitidos = null;
	
	private Vector<String> vLabsEmit = new Vector<String>();

	private Vector<String> vValsEmit = new Vector<String>();
	
	private JRadioGroup<String, String> rgFaturados = null;

	private JRadioGroup<String, String> rgFinanceiro = null;

	public FREvoluVendas() {

		setTitulo( "Evolu��o de vendas" );
		setAtribos( 80, 80, 330, 520 );

		lcTipoCli.add( new GuardaCampo( txtCodTipoCli, "CodTipoCli", "C�d.tp.cli.", ListaCampos.DB_PK, false ) );
		lcTipoCli.add( new GuardaCampo( txtDescTipoCli, "DescTipoCli", "Descri��o do tipo do cliente", ListaCampos.DB_SI, false ) );
		lcTipoCli.montaSql( false, "TIPOCLI", "VD" );
		lcTipoCli.setQueryCommit( false );
		lcTipoCli.setReadOnly( true );
		txtCodTipoCli.setTabelaExterna( lcTipoCli, null );
		txtCodTipoCli.setFK( true );
		txtCodTipoCli.setNomeCampo( "CodTipoCli" );

		lcCli.add( new GuardaCampo( txtCodCli, "CodCli", "C�d.cli.", ListaCampos.DB_PK, false ) );
		lcCli.add( new GuardaCampo( txtRazCli, "RazCli", "Raz�o social do cliente", ListaCampos.DB_SI, false ) );
		lcCli.montaSql( false, "CLIENTE", "VD" );
		lcCli.setQueryCommit( false );
		lcCli.setReadOnly( true );
		txtCodCli.setTabelaExterna( lcCli, null );
		txtCodCli.setFK( true );
		txtCodCli.setNomeCampo( "CodCli" );

		Calendar cPeriodo = Calendar.getInstance();
		txtDatafim.setVlrDate( cPeriodo.getTime() );
		cPeriodo.set( Calendar.DAY_OF_MONTH, 1 );
		cPeriodo.set( Calendar.MONTH, 0 );
		txtDataini.setVlrDate( cPeriodo.getTime() );
		cPeriodo.set( Calendar.DAY_OF_MONTH, 31 );
		cPeriodo.set( Calendar.MONTH, 11 );
		txtDatafim.setVlrDate( cPeriodo.getTime() );

		adic( new JLabelPad( "Per�odo:" ), 7, 5, 120, 20 );
		adic( new JLabelPad( "De:" ), 7, 25, 30, 20 );
		adic( txtDataini, 40, 25, 97, 20 );
		adic( new JLabelPad( "A:" ), 140, 25, 17, 20 );
		adic( txtDatafim, 160, 25, 100, 20 );

		adic( new JLabelPad( "C�d.cli." ), 7, 45, 300, 20 );
		adic( txtCodCli, 7, 65, 60, 20 );
		adic( new JLabelPad( "Raz�o social do cliente" ), 70, 45, 300, 20 );
		adic( txtRazCli, 70, 65, 200, 20 );

		adic( new JLabelPad( "C�d.tp.cli." ), 7, 85, 300, 20 );
		adic( txtCodTipoCli, 7, 105, 60, 20 );
		adic( new JLabelPad( "Descri��o do tipo de cliente" ), 70, 85, 300, 20 );
		adic( txtDescTipoCli, 70, 105, 200, 20 );

		cbVendas.setVlrString( "S" );
		adic( cbVendas, 5, 130, 265, 25 );

		adic( new JLabelPad( "Tipo de gr�fico:" ), 7, 160, 220, 20 );
		adic( new JLabelPad( Icone.novo( "graficoBarra.png" ) ), 7, 190, 30, 30 );
		adic( new JLabelPad( Icone.novo( "graficoLinha.gif" ) ), 7, 230, 30, 30 );

		vLabs.addElement( "Barras 3D" );
		vLabs.addElement( "Linha horizontal" );
		vVals.addElement( "B" );
		vVals.addElement( "L" );
		rgGrafico = new JRadioGroup<String, String>( 2, 1, vLabs, vVals );
		rgGrafico.setVlrString( "B" );
		rgGrafico.setBorder( BorderFactory.createEmptyBorder() );
		adic( rgGrafico, 42, 193, 200, 82 );
		
		Vector<String> vLabs1 = new Vector<String>();
		Vector<String> vVals1 = new Vector<String>();
		
		vLabs1.addElement( "Faturado" );
		vLabs1.addElement( "N�o Faturado" );
		vLabs1.addElement( "Ambos" );
		vVals1.addElement( "S" );
		vVals1.addElement( "N" );
		vVals1.addElement( "A" );
		rgFaturados = new JRadioGroup<String, String>( 3, 1, vLabs1, vVals1 );
		rgFaturados.setVlrString( "S" );

		Vector<String> vLabs2 = new Vector<String>();
		Vector<String> vVals2 = new Vector<String>();

		vLabs2.addElement( "Financeiro" );
		vLabs2.addElement( "N�o Financeiro" );
		vLabs2.addElement( "Ambos" );
		vVals2.addElement( "S" );
		vVals2.addElement( "N" );
		vVals2.addElement( "A" );
		rgFinanceiro = new JRadioGroup<String, String>( 3, 1, vLabs2, vVals2 );
		rgFinanceiro.setVlrString( "S" );
		
		vLabsEmit.addElement( "Emitidos" );
		vLabsEmit.addElement( "N�o emitidos" );
		vLabsEmit.addElement( "Ambos" );
		vValsEmit.addElement( "S" );
		vValsEmit.addElement( "N" );
		vValsEmit.addElement( "A" );
		rgEmitidos = new JRadioGroup<String, String>( 3, 1, vLabsEmit, vValsEmit );
		rgEmitidos.setVlrString( "A" );
		
		adic( rgFaturados, 	7, 		285, 	120, 	70 );
		adic( rgFinanceiro, 153,	285, 	120, 	70 );
		adic( rgEmitidos,	7,		360, 	120, 	70 );
		

	}

	public void setConexao( DbConnection cn ) {

		super.setConexao( cn );
		lcTipoCli.setConexao( con );
		lcCli.setConexao( con );
	}

	private ResultSet buscaValores() {

		PreparedStatement ps = null;
		ResultSet rs = null;

		java.sql.Date dataIni = Funcoes.dateToSQLDate( txtDataini.getVlrDate() );
		java.sql.Date dataFim = Funcoes.dateToSQLDate( txtDatafim.getVlrDate() );

		try {

			ps = con.prepareStatement( "SELECT * FROM VDEVOLUVENDAS(?,?,?,?,?,?,?,?,?,?)" );

			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, Aplicativo.iCodFilialMz );
			ps.setDate( 3, dataIni );
			ps.setDate( 4, dataFim );
			
					if ( !"".equals( txtCodTipoCli.getVlrString() ) && "".equals( txtCodCli.getVlrString() ) ) {

				ps.setInt( 5, Integer.parseInt( txtCodTipoCli.getVlrString() ) );
				ps.setNull( 6, Types.INTEGER );
			}
			else {

				ps.setNull( 5, Types.INTEGER );

				if ( "".equals( txtCodTipoCli.getVlrString() ) && !"".equals( txtCodCli.getVlrString() ) ) {

					ps.setInt( 6, Integer.parseInt( txtCodCli.getVlrString() ) );
				}
				else if ( !"".equals( txtCodTipoCli.getVlrString() ) && !"".equals( txtCodCli.getVlrString() ) ) {

					ps.setInt( 6, Integer.parseInt( txtCodCli.getVlrString() ) );
					Funcoes.mensagemInforma( this, "O filtro por tipo de cliente ser� desconsiderado..." );
				}
				else {

					ps.setNull( 6, Types.INTEGER );
				}
			}

			ps.setString( 7, cbVendas.getVlrString() );
			
			ps.setString( 8, rgFaturados.getVlrString() );
			ps.setString( 9, rgFinanceiro.getVlrString() );
			ps.setString( 10, rgEmitidos.getVlrString() );

			rs = ps.executeQuery();

		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar valores das vendas!\n" + err.getMessage(), true, con, err );
		}

		return rs;
	}

	public void imprimir( TYPE_PRINT bVisualizar ) {

		if ( txtDatafim.getVlrDate().before( txtDataini.getVlrDate() ) ) {

			Funcoes.mensagemInforma( this, "Data final maior que a data inicial!" );
			return;
		}
		else if ( Funcoes.contaMeses( txtDataini.getVlrDate(), txtDatafim.getVlrDate() ) < 2 ) {

			Funcoes.mensagemInforma( this, "Per�odo inferior a 2 meses!" );
			return;
		}

		try {

			if ( "B".equals( rgGrafico.getVlrString() ) ) {

				EvoluVendasBarras evVendas = new EvoluVendasBarras();
				evVendas.setConexao( con );
				evVendas.setConsulta( buscaValores() );
				dl = new FPrinterJob( evVendas, this );
				dl.setVisible( true );
			}
			else if ( "L".equals( rgGrafico.getVlrString() ) ) {

				EvoluVendasLinha evVendas = new EvoluVendasLinha();
				evVendas.setConexao( con );
				evVendas.setConsulta( buscaValores() );
				dl = new FPrinterJob( evVendas, this );
				dl.setVisible( true );
			}
		} catch ( Exception err ) {
			Funcoes.mensagemInforma( this, "N�o foi poss�vel carregar relat�rio!\n" + err.getMessage() );
			err.printStackTrace();
		}

	}
}
