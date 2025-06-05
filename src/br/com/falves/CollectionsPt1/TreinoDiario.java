/**
 * @author falvesmac
 */

package br.com.falves.CollectionsPt1;

import java.util.ArrayList;

public class TreinoDiario {
    public static void main(String[] args) {

        // Instancing Exercícios
        ExercicioAcademia supinoInclinado = new ExercicioAcademia("Supino Inclinado", 3);
        ExercicioAcademia supinoReto = new ExercicioAcademia("Supino Reto", 3);
        ExercicioAcademia voador = new ExercicioAcademia("Voador", 3);
        ExercicioAcademia triceps = new ExercicioAcademia("Triceps", 3);
        ExercicioAcademia biceps = new ExercicioAcademia("Biceps", 3);

        // Criando Lista de Exercícios e adicionando-os
        ArrayList<ExercicioAcademia> listaDeExercicios = new ArrayList<>();
        listaDeExercicios.add(supinoInclinado);
        listaDeExercicios.add(supinoReto);
        listaDeExercicios.add(voador);
        listaDeExercicios.add(triceps);
        listaDeExercicios.add(biceps);

        // Imprimindo lista de exercícios
        imprimirExercicios(listaDeExercicios);

        // Removendo exercício
        listaDeExercicios.remove(1);

        // Imprimindo lista de exercícios
        imprimirExercicios(listaDeExercicios);

        // Verificando se existe exercício na lista
        System.out.println("-------------------");
        String exercicioParaBusca = "Voador";
        System.out.println("Procurando exercício " + exercicioParaBusca);
        for (ExercicioAcademia exercicioAcademia : listaDeExercicios) {
            boolean procuraExercicio = exercicioAcademia.getNome().equalsIgnoreCase(exercicioParaBusca);
            if (procuraExercicio) {
                System.out.println("Exercício " + exercicioParaBusca  + " encontrado na lista. ");
            } else {
                System.out.println("Exercício " + exercicioParaBusca + " não encontrado na lista. ");
            }
        }

        // Imprimir quantidade de exercícios na lista
        System.out.println("-------------------");
        System.out.println("Quantidade de exerícicios na lista: " + listaDeExercicios.size());
    }

    // Method que imprime lista de exercícios
    private static void imprimirExercicios(ArrayList<ExercicioAcademia> listaDeExercicios) {
        System.out.println("-------------------");
        System.out.println("Exercícios Academia");
        for (ExercicioAcademia exercicioAcademia : listaDeExercicios) {
            System.out.println(exercicioAcademia.toString());
        }
    }
}