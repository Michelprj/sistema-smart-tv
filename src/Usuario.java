public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atal: " + smartTv.canal);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(14);

        System.out.println("Canal atual: " + smartTv.canal);
        
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

       smartTv.Ligar ();
       System.out.println("Novo status => Tv Ligada? " + smartTv.ligada);
    }
}
