package Ejercicios;


public class EjerciciosMatrices {


    public void imprimirMatrizCadena(String[][] matriz) {
       System.out.println("..................................");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }
        System.out.println("..................................");
       
    }  
    
    public void transformada18(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }





    public void transformada07(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada17(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }
    

    public void transformada12(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    
    public void transformada13(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }
    
   
  
   
    public void transformada15(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[(dimen-1)-j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada21(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada25(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada27(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }    
}

