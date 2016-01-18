package cg;

public class exo1 {


		public static void main(String args[]) {
		       /* Scanner in = new Scanner(System.in);
		        int width = in.nextInt(); // the number of cells on the X axis
		        int height = in.nextInt(); // the number of cells on the Y axis
		        char [][] tab= new char[height][width];
		        String [] lignes=new String[width];
		        in.nextLine();
		        for (int i = 0; i < height; i++) {
		            String line = in.nextLine(); // width characters, each either 0 or .
		            for (int j=0;j<width;j++){
		                tab[i][j]=line.charAt(j);
		            }
		                lignes[i]=line;
		        }

		        // Write an action using System.out.println()
		        // To debug: System.err.println("Debug messages...");
		    System.err.println("Largeur: "+width);
		    System.err.println("hauteur: "+height);
		        for (String i:lignes){
		            System.err.println(i);
		        }
		        
		        /*
		        /*
		        for (int i=0;i<height;i++){
		            for (int j=0;j<width;j++){
		                String result="";
		                //System.err.println(tab[i][j]);
		                if (tab[i][j]=='0'){
		                    result=i+" "+j;
		                    if ((tab[i][j+1]=='0')&&(j<width)){
		                        result=result+" "+i+" "+j+1;
		                    }else{
		                        result=result+" -1 -1";
		                    }
		                    if ((tab[i+1][j]=='0')&&(i<height)){
		                        result=result+" "+1+" "+j;
		                    }else{
		                        result=result+" -1 -1";
		                    }
		                }
		                System.err.println(result);
		            }
		            
		        }*/
		        
		        int width = 3; // the number of cells on the X axis
		        int height = 3; // the number of cells on the Y axis
		        char [][] tab= new char[height][width];
		        String ligne1="0.0";
		        String ligne2="...";
		        String ligne3="0.0";
		        
		        for (int j=0;j<width;j++){
		            tab[0][j]=ligne1.charAt(j);
		            tab[1][j]=ligne2.charAt(j);
		            tab[2][j]=ligne3.charAt(j);
		                      
		        }

		        
		        for (int j=0;j<height;j++){
		            for (int i=0;i<width;i++){
		                Boolean ok=true;
		                String result ="";
		                //System.err.println(tab[i][j]);
		                if (tab[i][j]=='0'){
		                    result=i+" "+j;
		                    if (i==(width-1)){
		                        result=result+" -1 -1";
		                    }else{
		                    	int k=i+1;
		                    	while ((ok) && (k<=(width-1))){
		                    		if (tab[k][j]=='0'){
		                                result=result+" "+k+" "+j;
		                                ok=false;
		                            }else{
		                                    k++;
		                                }
		                        }
		                    	if (k==width){
		                    		result=result+" -1 -1";
		                    	}
		                     }
		                   	ok=true;
		                    if (j==(height-1)){
		                        result=result+" -1 -1";
		                    }else{
		                    	int k=j+1;
		                    	while ((ok) && (k<=(height-1))){
		                    		if (tab[i][k]=='0'){
		                                result=result+" "+i+" "+k;
		                                ok=false;
		                            }else{
		                                    k++;
		                                }
		                        }
		                    	if (k==height){
		                    		result=result+" -1 -1";
		                    	}	
		                    }  
		                    System.out.println(result);
		                }
		            }   
		        }    
		    }
	}

