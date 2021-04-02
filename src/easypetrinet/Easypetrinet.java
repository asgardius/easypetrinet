package easypetrinet;

public class Easypetrinet {

    public static void main(String[] args) {
        
        int[][] places_tokens = {{1,1}, {2,0}, {3,1}, {4,0} ,{5,1}};
        int transitor_activo;
        Petrinet petrinet = new Petrinet();   
        
        for (int i = 0; i < 10; i++) {
            transitor_activo =  petrinet.TransitorActivo(places_tokens);
            switch (transitor_activo) {
                case 1:
                    petrinet.Transitor_1(places_tokens);
                    System.out.println("");
                    break;
                case 2:
                    petrinet.Transitor_2(places_tokens);
                    System.out.println("");
                    break;
                case 3:
                    petrinet.Transitor_3(places_tokens);
                    System.out.println("");
                    break;
                case 4:
                    petrinet.Transitor_4(places_tokens);
                    System.out.println("");
                    break;
                case 5:
                    petrinet.Transitor_5(places_tokens);
                    System.out.println("");
                    break;                
            }            
        }
    }
}
