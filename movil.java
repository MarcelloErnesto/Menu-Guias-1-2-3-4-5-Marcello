/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author marcello
 */
public class movil {
    
    
    public movil(){}

  
private float arrayPix []= new float [2];




public int bateriaPantalla(float pantalla, int bateria){
    int puntaje=0;
    if(pantalla<=4.0){  //hace comparacion haciendo uso de if anidados
         if(bateria <=1200){
         puntaje+=3;             
         }else if(bateria >1200 && bateria <= 2400){
         puntaje+=4;         
         }else if(bateria >2400 && bateria <= 3100){
         puntaje+=5;         
         }else{
         puntaje+=6;         
         }
    } else if(pantalla>4.0 && pantalla <= 5.0 ) {
         if(bateria <=1200){
         puntaje+=1;             
         }else if(bateria >1200 && bateria <= 2400){
         puntaje+=2;         
         }else if(bateria >2400 && bateria <= 3100){
         puntaje+=3;         
         }else{
         puntaje+=4;         
         }
    }else{
        if(bateria <=1200){
         puntaje+=0;             
         }else if(bateria >1200 && bateria <= 2400){
         puntaje+=1;         
         }else if(bateria >2400 && bateria <= 3100){
         puntaje+=2;         
         }else{
         puntaje+=3;         
         }}
  return puntaje;  
}

//NEXUX, GOOGLE, LENOVO, HUAWEI, APPLE, SONY
//SAMSUNG, LG, ALCATEL 3
//oTRA MARCA 2
public int referenciaDeMarca(String marca){
    int puntaje=0;
    if(marca.equals("NEXUS") || marca.equals("GOOGLE") || marca.equals("LENOVO")|| marca.equals("HUAWEI") || marca.equals("APPLE")|| marca.equals("SONY")){
    puntaje+=4;
    }else if(marca.equals("SAMSUNG") || marca.equals("LG")|| marca.equals("ALCATEL")){
    puntaje+=3;    
    }
    else{
    puntaje+=2;    
    }    
return puntaje;
}

public int pixelaje(){
    int puntaje=0;
    if( this.getArrayPix()[0]<=5.0){  //compara usando if anidados
        if( this.getArrayPix()[1]<=2.0){
            puntaje +=1;
             if(this.getArrayPix()[0]==0){
             puntaje -=1;
             }
        }else{
          puntaje+=2;
        }
    }else if(this.getArrayPix()[0]>5.0 && this.getArrayPix()[0]<=8.0){
         if(this.getArrayPix()[1]<=2.0){
            puntaje +=1;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }else if(this.getArrayPix()[1]>2.0 && this.getArrayPix()[1]<=5.0){
        puntaje +=2;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }else{
            puntaje+=3;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }
    }else{
        if( this.getArrayPix()[1]<=2.0){
            puntaje +=1;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }else if(this.getArrayPix()[1]>2.0 && this.getArrayPix()[1]<=5.0){
        puntaje +=2;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }else{
            puntaje+=3;
             if(this.getArrayPix()[2]==0){
             puntaje -=1;
             }
        }
    }
    
return puntaje;
}

public int garantia(int garantia){
int puntaje=0;
        if(garantia<=3){
        puntaje+=1;
        }else if(garantia>3 && garantia<=6){
        puntaje+=2;
        }else{
        puntaje+=4;
        }
    return puntaje;
}
    
public int cpu(int nucleos){
   int puntaje=0;
    switch (nucleos) {
        case 2:
            puntaje+=0;
            break;
        case 4:
            puntaje+=1;
            break;
        case 6:
            puntaje+=3;
            break;
        default:
            puntaje+=4;
            break;
    }
    
    return puntaje;
}
    
public int RAM(float RAM){
    int puntaje=0;
        if(RAM<=1.0){
        puntaje+=0;
        }else if(RAM>1.0 && RAM<=2.0){
        puntaje+=2;
        }else if(RAM>2.0 && RAM<=4.0){
        puntaje+=4;
        }else{
        puntaje+=6;
        }
    return puntaje;
}

public int precio(float precio){
int puntaje=0;
    if(precio<=100.00){
        puntaje+=2;
        }else if(precio>100.00 && precio<=350.00){
        puntaje+=3;
        }else{
        puntaje+=4;
        }
    return puntaje;
}

    /**
     * @return the arrayPix
     */
    public float[] getArrayPix() {
        return arrayPix;
    }

    
    public void setArrayPix(int indice, float valor) {
        this.arrayPix[indice] = valor;
    }
    
    public String mensaje(int puntaje){
    String mensaje="";
    if(puntaje <=7){
    mensaje="La inversion es de riesgo";
    }else if(puntaje>7 && puntaje <=14){
    mensaje="La inversion es riesgosa";
    }else if(puntaje>14 && puntaje <=21){
    mensaje="La inversion es viable";
    }else{
    mensaje="La inversion es muy buena";
    }
    return mensaje;
    }

}