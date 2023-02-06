public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smartTv = new SmarTv();

        System.out.println("TV Ligada? : " + smartTv.ligada);
        System.out.println("Canal Atual ? : " + smartTv.canal);
        System.out.println("Volume Atual ? : " + smartTv.volume);
        System.out.println(("============================================================="));
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        


    }
}
