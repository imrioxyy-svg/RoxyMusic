package com.rioxy.music;
import android.app.*;import android.content.*;import android.os.*;import androidx.annotation.Nullable;import androidx.media3.common.*;import androidx.media3.exoplayer.ExoPlayer;import androidx.media3.session.*;
public class MusicService extends MediaLibraryService{
 private ExoPlayer player; private MediaLibrarySession session;
 @Override public void onCreate(){super.onCreate();player=new ExoPlayer.Builder(this).build();session=new MediaLibrarySession.Builder(this,player,new MediaLibrarySession.Callback(){}).build();}
 @Nullable @Override public MediaLibrarySession onGetSession(MediaSession.ControllerInfo c){return session;}
 @Override public void onDestroy(){session.release();player.release();super.onDestroy();}
}
