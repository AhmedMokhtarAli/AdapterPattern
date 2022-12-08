public class Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        MediaAdapter mediaAdapter;
        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Mp3 is playing "+fileName);
        }
        else if (audioType.equalsIgnoreCase("VLC")||audioType.equalsIgnoreCase("MP4"))
        {
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else
        {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
