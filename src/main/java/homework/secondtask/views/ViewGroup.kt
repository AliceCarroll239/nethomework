package homework.secondtask.views

class ViewGroup: View() {

    var listViews: MutableList<View> = mutableListOf()

    fun addView(view: View) {
        listViews.add(view)
    }
}