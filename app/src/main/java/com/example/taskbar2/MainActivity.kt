package com.example.taskbar2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.mytoolbar))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu, menu)
//
//        //val searchItem = menu?.findItem(R.id.action_search)
//        //val searchView = searchItem?.actionView as SearchView
//
//        // Configure the search info and add any event listeners.
//
//        return super.onCreateOptionsMenu(menu)
//}
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.options, menu)
//
//        // Define the listener.
//        val expandListener = object : MenuItem.OnActionExpandListener {
//            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
//                // Do something when the action item collapses.
//                return true // Return true to collapse the action view.
//            }
//
//            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
//                // Do something when it expands.
//                return true // Return true to expand the action view.
//            }
//        }
//
//        // Get the MenuItem for the action item.
//        val actionMenuItem = menu?.findItem(R.id.myActionItem)
//
//        // Assign the listener to that action item.
//        actionMenuItem?.setOnActionExpandListener(expandListener)
//
//        // For anything else you have to do when creating the options menu,
//        // do the following:
//
//        return true
//    }
}