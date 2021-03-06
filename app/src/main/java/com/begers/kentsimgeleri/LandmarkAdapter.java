package com.begers.kentsimgeleri;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.begers.kentsimgeleri.databinding.RecyclerRowBinding;

import java.util.ArrayList;
import java.util.List;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    private Singleton singleton;
    List<Landmark> data;

    public LandmarkAdapter(List<Landmark> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //xml bağlama işlemi burada yapılır
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {  //layout içerisinde göstermek istediğimiz veriler burada gösterilir.
        holder.binding.recyclerViewTextView.setText(data.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(holder.itemView.getContext(), DetayActivity.class);

                singleton = Singleton.getInstance();
                singleton.setSentLandmark(data.get(position));

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {  //xml nin kaç defa oluşturulacağını belirtir.
        return data.size();
    }

    public  class  LandmarkHolder extends  RecyclerView.ViewHolder {  //görünüm tutucu

        private RecyclerRowBinding binding;

        public LandmarkHolder(@NonNull RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
