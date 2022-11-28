/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CONTROLS;

import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class ControlTelaAgendamentoTest {
    
    public ControlTelaAgendamentoTest() {
    }

    /**
     * Test of CriarAgendamento method, of class ControlTelaAgendamento.
     */
    @Test
    public void testCriarAgendamento() throws Exception {
        System.out.println("CriarAgendamento");
        String nome_cliente = "";
        String servico = "";
        String valor_servico = "";
        String data_agendamento = "";
        String hora_agendamento = "";
        String observacao_agendamento = "";
        boolean expResult = false;
        boolean result = ControlTelaAgendamento.CriarAgendamento(nome_cliente, servico, valor_servico, data_agendamento, hora_agendamento, observacao_agendamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agendar method, of class ControlTelaAgendamento.
     */
    @Test
    public void testAgendar() throws Exception {
        System.out.println("Agendar");
        String nome_cliente = "";
        String servico = "";
        String valor_servico = "";
        String data_agendamento = "";
        String hora_agendamento = "";
        String observacao_agendamento = "";
        String expResult = "";
        String result = ControlTelaAgendamento.Agendar(nome_cliente, servico, valor_servico, data_agendamento, hora_agendamento, observacao_agendamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PreencherTabela method, of class ControlTelaAgendamento.
     */
    @Test
    public void testPreencherTabela() throws Exception {
        System.out.println("PreencherTabela");
        JTable TabelaAgendamentoJTable = null;
        JTable expResult = null;
        JTable result = ControlTelaAgendamento.PreencherTabela(TabelaAgendamentoJTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarAgendamento method, of class ControlTelaAgendamento.
     */
    @Test
    public void testEditarAgendamento() throws Exception {
        System.out.println("EditarAgendamento");
        String nome_cliente = "";
        String servico = "";
        String valor_servico = "";
        String data_agendamento = "";
        String hora_agendamento = "";
        String observacao_agendamento = "";
        int ID_agendamento = 0;
        ControlTelaAgendamento.EditarAgendamento(nome_cliente, servico, valor_servico, data_agendamento, hora_agendamento, observacao_agendamento, ID_agendamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirAgendamento method, of class ControlTelaAgendamento.
     */
    @Test
    public void testExcluirAgendamento() throws Exception {
        System.out.println("ExcluirAgendamento");
        JTable TabelaAgendamentoJTable = null;
        ControlTelaAgendamento.ExcluirAgendamento(TabelaAgendamentoJTable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LimparAgendamento method, of class ControlTelaAgendamento.
     */
    @Test
    public void testLimparAgendamento() throws Exception {
        System.out.println("LimparAgendamento");
        JTable TabelaAgendamentoJTable = null;
        ControlTelaAgendamento.LimparAgendamento(TabelaAgendamentoJTable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
