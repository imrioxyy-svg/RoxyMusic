package com.rioxy.music;
import android.view.*;import android.widget.*;import androidx.annotation.NonNull;import androidx.recyclerview.widget.RecyclerView;import java.util.*;
public class SongAdapter extends RecyclerView.Adapter<SongAdapter.VH>{
 public interface Listener{void play(Song s);void favorite(Song s);}
 List<Song> data=new ArrayList<>(); Listener listener; Set<Long> favorites;
 SongAdapter(Listener l,Set<Long> f){listener=l;favorites=f;}
 void submit(List<Song> x){data=new ArrayList<>(x);notifyDataSetChanged();}
 @NonNull public VH onCreateViewHolder(@NonNull ViewGroup p,int v){return new VH(LayoutInflater.from(p.getContext()).inflate(com.rioxy.music.R.layout.row_song,p,false));}
 public void onBindViewHolder(@NonNull VH h,int pos){Song s=data.get(pos);h.title.setText(s.title);h.artist.setText(s.artist+(s.album.isEmpty()?"":" • "+s.album));h.fav.setText(favorites.contains(s.id)?"♥":"♡");h.itemView.setOnClickListener(v->listener.play(s));h.fav.setOnClickListener(v->listener.favorite(s));}
 public int getItemCount(){return data.size();}
 static class VH extends RecyclerView.ViewHolder{TextView title,artist,fav;VH(View v){super(v);title=v.findViewById(R.id.title);artist=v.findViewById(R.id.artist);fav=v.findViewById(R.id.fav);}}
}
