package cardviewandrecyclerview.cruzrovira.blackice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cruzr on 6/4/2016.
 */
public class TitularAdapter extends RecyclerView.Adapter<TitularAdapter.TitularViewHolder> {
    List<Titular> titulares;

    public TitularAdapter(List<Titular> titulares) {
        this.titulares = titulares;
    }

    @Override
    public TitularViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardtitular,parent,false);
        TitularViewHolder vh = new TitularViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(TitularViewHolder holder, int position) {
        Titular titular = titulares.get(position);
        holder.tvTitulo.setText(titular.getTitulo());
        holder.tvContenido.setText(titular.getContenido());
        holder.imageView.setImageResource(titular.getImagen());

    }

    @Override
    public int getItemCount() {
        return titulares.size();
    }

    public  static class TitularViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tvTitulo;
        private  TextView tvContenido;

        public TitularViewHolder(View itemView) {
            super(itemView);
            imageView =(ImageView) itemView.findViewById(R.id.imageview);
            tvTitulo=(TextView) itemView.findViewById(R.id.tvTitulo);
            tvContenido =(TextView) itemView.findViewById(R.id.tvContenido);
        }
    }
}
