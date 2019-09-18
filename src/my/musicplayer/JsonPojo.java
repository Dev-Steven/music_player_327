/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.musicplayer;

/**
 *
 * @author stevenchung
 */
public class JsonPojo {
    
    // Release Objects
    public JsonPojo release;
//        public int id;
//        public String name;
//    
//    // Artist Ojects
    public JsonPojo artist;
//        public String id;
        public String name;
//    
//    // Song Ojects
    public JsonPojo song;
        public String title;
//    
    public JsonPojo getRelease() { return release; }
//    public int getId() { return id; }
//    public JsonPojo getArtist() { return artist; }
//    public JsonPojo getSong() { return song; }    

    String getName() {
        return name;
    }
}
