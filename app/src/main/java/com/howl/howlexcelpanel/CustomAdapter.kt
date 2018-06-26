package com.howl.howlexcelpanel

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.zhouchaoyuan.excelpanel.BaseExcelPanelAdapter
import kotlinx.android.synthetic.main.item.view.*


class CustomAdapter(var context : Context) : BaseExcelPanelAdapter<TopTitle,LeftTitle,Cell>(context){
    override fun onCreateTopViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return TopHolder(view)
    }

    class TopHolder(view: View?) : RecyclerView.ViewHolder(view) {

    }

    override fun onBindTopViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        var topTitle = getTopItem(position)
        holder?.itemView?.textItem?.text = topTitle.title
    }



    override fun onCreateLeftViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return LeftHolder(view)
    }

    override fun onBindLeftViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        var topTitle = getLeftItem(position)
        holder?.itemView?.textItem?.text = topTitle.title
    }
    class LeftHolder(view: View?) : RecyclerView.ViewHolder(view) {

    }



    override fun onCreateCellViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return CellHolder(view)
    }



    override fun onBindCellViewHolder(holder: RecyclerView.ViewHolder?, verticalPosition: Int, horizontalPosition: Int) {
        var cellTitle = getMajorItem(verticalPosition,horizontalPosition)
        holder?.itemView?.textItem?.text = cellTitle.title
    }
    class CellHolder(view: View?) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateTopLeftView(): View {
        return LayoutInflater.from(context).inflate(R.layout.item,null)
    }



}