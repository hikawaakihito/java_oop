public class PlayerTester{
    public static void main(String[] args){
        Player[] a = {new VideoPlayer(),new CDPlayer(),new PortablePlayer(),new DVDPlayer()};

        for(Player p : a){
            p.play();
            p.stop();
            if(p instanceof PortablePlayer) ((PortablePlayer)p).changeSkin(Skinnable.RED);
            if(p instanceof DVDPlayer) ((DVDPlayer)p).slow();
            System.out.println();
        }
    }
}