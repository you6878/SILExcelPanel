package com.howl.howlexcelpanel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

data class TopTitle(var title:String? = null)
data class LeftTitle(var title:String? = null)
data class Cell(var title:String? = null)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var adapter = CustomAdapter(this)
        content_container.setAdapter(adapter)
        adapter.setAllData(leftColData(),topRowData(),cellData())
    }

    fun topRowData():List<TopTitle>{
        var topTitles = ArrayList<TopTitle>()
        var week = arrayOf("월","화","수","목","금","토","일")
        for(item in week){
            var topTitle = TopTitle()
            topTitle.title = item
            topTitles.add(topTitle)

        }
        return topTitles
    }
    fun leftColData():List<LeftTitle>{
        var leftTitles = ArrayList<LeftTitle>()
        for(i in 1..7){
            var leftTitle = LeftTitle()
            leftTitle.title = i.toString() + "교시"
            leftTitles.add(leftTitle)
        }
        return leftTitles

    }

    fun cellData():List<List<Cell>>{

        var cells = ArrayList<List<Cell>>()

        for(i in 0 .. 6){
            var cellList = ArrayList<Cell>()
            cells.add(cellList)

            for(i in 0..6){
                var cell = Cell()
                var random = Random()
                var number = random.nextInt(6)

                if(number == 1){
                    cell.title = "국어"
                }
                if(number == 2){
                    cell.title = "수학"
                }
                if(number == 3){
                    cell.title = "사회"
                }
                cellList.add(cell)
            }
        }
        return cells
    }
}
