package com.eleodoro;


public class App 
{
    public static void main( String[] args )
    {
        Connection conexao = new Conexao().getConnection();
        TurmaDao turmaDao = new TurmaDao(conexao);

        Turma turmaInsert = new Turma("testeTurmainsert", "654321");
        Turma turmaInserida = turmaDaoInsert(turmaInsert);

        Turma turmaSelecionada = turmaDao.selectPorId(turmaInserida);

        turmaDao.delete(turmaSelecionada);

        ArrayList<Turma> turmas = turmaDao.selectAll();

        Turma turmaUpdate = new turma(1, "turma3");
        Turma turmaAlterada = turmaDaoUpdate(turmaUpdate);
    }
}
