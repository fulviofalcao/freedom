/**
 * @version 16/50/2007 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 * 
 *         Projeto: Freedom <BR>
 * 
 *         Pacote: org.freedom.modulos.std <BR>
 *         Classe:
 * @(#)FHistPad.java <BR>
 * 
 *                   Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 *                   modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 *                   na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 *                   Este programa � distribuido na esperan�a que possa ser util, mas SEM NENHUMA GARANTIA; <BR>
 *                   sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 *                   Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 *                   Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 *                   de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 *                   Tela para cadastro de historicos padr�o.
 * 
 */

package org.freedom.modulos.fnc.view.frame.crud.tabbed;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JScrollPane;

import org.freedom.acao.JComboBoxEvent;
import org.freedom.acao.JComboBoxListener;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.component.JComboBoxPad;
import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.component.JTextAreaPad;
import org.freedom.library.swing.component.JTextFieldPad;
import org.freedom.library.swing.frame.FDados;

public class FHistPad extends FDados implements ActionListener, JComboBoxListener {

	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtCodHist = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private JTextFieldPad txtDescHist = new JTextFieldPad( JTextFieldPad.TP_STRING, 80, 0 );

	private final JTextAreaPad txaHistPad = new JTextAreaPad( 500 );

	private final JScrollPane spnHist = new JScrollPane( txaHistPad );

	private final JPanelPad panelCampos = new JPanelPad();

	private final JPanelPad pinCab = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private JComboBoxPad cbCamposDin = null;

	public FHistPad() {

		super();
		setTitulo( "Cadastro de Hist�ricos padr�o" );
		setAtribos( 50, 50, 440, 380 );

		montaCombos();
		montaTela();

		cbCamposDin.addComboBoxListener( this );

	}

	private void montaTela() {

		txaHistPad.setFont( new Font( "Courier", Font.PLAIN, 11 ) );
		txaHistPad.setTabSize( 0 );

		panelCampos.setPreferredSize( new Dimension( 440, 90 ) );
		setPainel( panelCampos );

		adicCampo( txtCodHist, 7, 20, 70, 20, "CodHist", "C�d.hist.", ListaCampos.DB_PK, true );
		adicCampo( txtDescHist, 80, 20, 330, 20, "DescHist", "Descri��o do hist�rico", ListaCampos.DB_SI, true );
		adicDBLiv( txaHistPad, "TxaHistPad", "Corpo", false );
		setListaCampos( true, "HISTPAD", "FN" );

		adic( new JLabelPad( "Campos de dados" ), 7, 40, 223, 20 );
		adic( cbCamposDin, 7, 60, 223, 20 );

		pinCab.add( panelCampos, BorderLayout.NORTH );
		pinCab.add( spnHist, BorderLayout.CENTER );

		this.add( pinCab );

	}

	private void montaCombos() {

		Vector<String> vLabs = new Vector<String>();
		vLabs.addElement( "<--Selecione-->" );
		vLabs.addElement( "Portador" );
		vLabs.addElement( "Valor" );
		vLabs.addElement( "N�mero do documento" );
		vLabs.addElement( "Data" );
		vLabs.addElement( "Hist�rico digitado" );

		Vector<String> vVals = new Vector<String>();
		vVals.addElement( "" );
		vVals.addElement( "<PORTADOR>" );
		vVals.addElement( "<VALOR>" );
		vVals.addElement( "<DOCUMENTO>" );
		vVals.addElement( "<DATA>" );
		vVals.addElement( "<HISTORICO>" );

		cbCamposDin = new JComboBoxPad( vLabs, vVals, JComboBoxPad.TP_STRING, 20, 0 );

	}

	public void valorAlterado( JComboBoxEvent evt ) {

		if ( evt.getComboBoxPad() == cbCamposDin ) {

			txaHistPad.insert( cbCamposDin.getVlrString(), txaHistPad.getCaretPosition() );
		}

	}

}
