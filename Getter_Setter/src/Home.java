public class Home {

    private int room;
    private String color;
    private String warmUp;
    private int meter;


    //getter-setter yapısı

    /*public void setRoom(int room) {
        this.room = room;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWarmUp(String warmUp) {
        this.warmUp = warmUp;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public int getRoom() {
        return room;
    }

    public String getColor() {
        return color;
    }

    public String getWarmUp() {
        return warmUp;
    }

    public int getMeter() {
        return meter;
    }
*/

    //constructor yapısı
    public Home(int room, String color, String warmUp, int meter) {

        this.room = room;
        this.color = color;
        this.warmUp = warmUp;
        this.meter = meter;

    }

    public void cagir (){
        System.out.println("Oda Sayısı:"+this.room);
        System.out.println("Evin Rengi:"+this.color);
        System.out.println("Evin Isınma Şekli:"+this.warmUp);
        System.out.println("Kaç Metrekare:"+this.meter);


    }

}
