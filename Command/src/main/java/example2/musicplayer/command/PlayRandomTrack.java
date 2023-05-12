package example2.musicplayer.command;

import example2.musicplayer.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playRandomTrack();
    }
}
