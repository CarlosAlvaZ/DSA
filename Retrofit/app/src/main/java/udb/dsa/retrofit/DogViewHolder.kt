package udb.dsa.retrofit

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import udb.dsa.retrofit.databinding.ItemDogBinding

class DogViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
    private val itemDogBinding: ItemDogBinding

    init {
        itemDogBinding = ItemDogBinding.bind(view!!)
    }

    fun bind(imageUrl: String?) {
        Picasso.get().load(imageUrl).into(itemDogBinding.ivDog)
    }
}