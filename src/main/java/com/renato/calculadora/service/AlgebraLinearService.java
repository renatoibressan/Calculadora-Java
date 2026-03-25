package com.renato.calculadora.service;

public class AlgebraLinearService {
    public AlgebraLinearService() {
    }
    public double[] somaVetorial(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) throw new IllegalArgumentException("\nVetor(es) nulo(s)!\n");
        int n1 = v1.length, n2 = v2.length;
        if (n1 < 1 || n2 < 1) throw new IllegalArgumentException("\nTamanho de vetor(es) inválido(s)!\n");
        if (n1 != n2) throw new IllegalArgumentException("\nVetores devem ser do mesmo tamanho!\n");
        double[] vr = new double[n1];
        for (int i = 0; i < n1; i++) {
            vr[i] = v1[i] + v2[i];
        }
        return vr;
    }
    public double produtoEscalar(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) throw new IllegalArgumentException("\nVetor(es) nulo(s)!\n");
        int n1 = v1.length, n2 = v2.length;
        if (n1 < 1 || n2 < 1) throw new IllegalArgumentException("\nTamanho de vetor(es) inválido(s)!\n");
        if (n1 != n2) throw new IllegalArgumentException("\nVetores devem ser do mesmo tamanho!\n");
        double u = 0.0;
        for (int i = 0; i < n1; i++) {
            u += v1[i] * v2[i];
        }
        return u;
    }
    public double normaVetorial(double[] v) {
        if (v == null) throw new IllegalArgumentException("\nVetor nulo!\n");
        int n = v.length;
        if (n == 0) throw new IllegalArgumentException("\nTamanho de vetor inválido!\n");
        double norma = 0.0;
        for (int i = 0; i < n; i++) {
            norma += Math.pow(v[i], 2);
        }
        return Math.sqrt(norma);
    }
    public int[][] somaMatricial(int[][] A, int[][] B) {
        if (A == null || B == null) throw new IllegalArgumentException("\nMatriz(es) nula(s)!\n");
        int linhasDeA = A.length, linhasDeB = B.length;
        if (linhasDeA < 1 || linhasDeB < 1) throw new IllegalArgumentException("\nMatriz(es) vazia(s)!\n");
        int colunasDeA = A[0].length, colunasDeB = B[0].length;
        if (colunasDeA < 1 || colunasDeB < 1) throw new IllegalArgumentException("\nMatriz(es) vazia(s)!\n");
        if (linhasDeA != linhasDeB || colunasDeA != colunasDeB) throw new IllegalArgumentException("\nAs matrizes devem ser de mesma ordem!\n");
        int[][] C = new int[linhasDeA][colunasDeA];
        for (int i = 0; i < linhasDeA; i++) {
            for (int j = 0; j < colunasDeA; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public int[][] produtoMatricial(int[][] A, int[][] B) {
        if (A == null || B == null) throw new IllegalArgumentException("\nMatriz(es) nula(s)!\n");
        int linhasDeA = A.length, linhasDeB = B.length;
        if (linhasDeA < 1 || linhasDeB < 1) throw new IllegalArgumentException("\nMatriz(es) vazia(s)!\n");
        int colunasDeA = A[0].length, colunasDeB = B[0].length;
        if (colunasDeA < 1 || colunasDeB < 1) throw new IllegalArgumentException("\nMatriz(es) vazia(s)!\n");
        if (colunasDeA != linhasDeB) throw new IllegalArgumentException("\nAs colunas de A devem ser iguais às linhas de B!\n");
        int[][] C = new int[linhasDeA][colunasDeB];
        for (int i = 0; i < linhasDeA; i++) {
            for (int j = 0; j < colunasDeB; j++) {
                for (int k = 0; k < colunasDeA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public int determinanteMatricial(int[][] M) {
        int i = M.length;
        if (i < 1) throw new IllegalArgumentException("\nOrdem da matriz inválida!\n");
        if (i > 3) throw new IllegalArgumentException("\nOrdem da matriz não suportada!\n");
        int j = M[0].length;
        if (i != j) throw new IllegalArgumentException("\nA matriz deve ser quadrada!\n");
        if (i == 1) return M[0][0];
        else if (i == 2) return M[0][0] * M[1][1] - M[0][1] * M[1][0];
        else {
            int n1 = (M[0][0] * M[1][1] * M[2][2]) + (M[0][1] * M[1][2] * M[2][0]) + (M[0][2] * M[1][0] * M[2][1]);
            int n2 = (M[0][2] * M[1][1] * M[2][0]) + (M[0][1] * M[1][0] * M[2][2]) + (M[0][0] * M[1][2] * M[2][1]);
            return n1 - n2;
        }
    }
}