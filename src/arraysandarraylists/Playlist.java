package arraysandarraylists;
/*
Use Java’s ArrayList methods to build and tweak your desert island music playlist.
ou’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪

Also, this is a chance to put your hard-earned Java skills to the test. Your mission, should you choose to accept it:

Build Playlist.java with the best possible playlist of music using a Java ArrayList. Choose wisely.
 */

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Happy");
        desertIslandPlaylist.add("careless whisperer");
        desertIslandPlaylist.add("hey ya!");
        desertIslandPlaylist.add("Uptown funk");
        desertIslandPlaylist.add("Roses");
        desertIslandPlaylist.add("Dance monkeys");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(4);
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.indexOf("careless whisperer"));
        System.out.println(desertIslandPlaylist.indexOf("Dance monkeys"));
        String a = desertIslandPlaylist.get(1);
        String b = desertIslandPlaylist.get(4);
        desertIslandPlaylist.set(4,a);
        desertIslandPlaylist.set(1,b);
        System.out.println(desertIslandPlaylist);
    }

}
