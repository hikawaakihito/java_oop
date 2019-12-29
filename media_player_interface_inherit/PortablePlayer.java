public class PortablePlayer implements Player, Skinnable{
    private int skin = BLACK;

    public PortablePlayer(){

    }

    public void play(){
        System.out.println("◆ 再生開始！");
    }

    public void stop(){
        System.out.println("◆ 再生終了！");
    }

    public void changeSkin(int skin){
        System.out.print("スキンを");
        switch(skin){
            case BLACK: System.out.print("漆黒"); break;
            case RED: System.out.print("深紅"); break;
            case GREEN: System.out.print("柳葉"); break;
            case BLUE: System.out.print("豹柄"); break;
            case LEOPARD: System.out.print("無地"); break;
        }
        System.out.println("に変更しました。");
    }
}