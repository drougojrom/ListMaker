package com.portfolio.romanustiantcev.listmaker

import android.content.Context
import android.preference.PreferenceManager

class ListDataManager(val context: Context) {
    fun saveList(list: TaskList) {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context).edit()
        sharedPreferences.putStringSet(list.name, list.tasks.toHashSet())
        sharedPreferences.apply()
    }

    fun readList(): ArrayList<TaskList> {
        val sharedPreference = PreferenceManager.getDefaultSharedPreferences(context)
        val sharedPreferencesContext = sharedPreference.all
        val taskLists = ArrayList<TaskList>()
        for (taskList in sharedPreferencesContext) {
            val itemHashSet = taskList.value as HashSet<String>
            val list = TaskList(taskList.key, ArrayList(itemHashSet))
            taskLists.add(list)
        }
        return taskLists
    }
}