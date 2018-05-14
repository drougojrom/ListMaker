package com.portfolio.romanustiantcev.listmaker

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListSelectionFragment : Fragment() {
    private var listener: OnListItemFragmentInteractionListener? = null

    interface  OnListItemFragmentInteractionListener {
        fun onListItemClicked(list: TaskList)
    }

    companion object {
        fun newInstance(): ListSelectionFragment {
            val fragment = ListSelectionFragment()
            return fragment
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context is OnListItemFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() +
                    " must implement OnListItemFragmentInteractionListener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list_selection,
                container,
                false)
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
