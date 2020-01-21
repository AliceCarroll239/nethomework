package homework.secondtask.views

class ViewGroup: View() {

    private var listViews: MutableList<View> = mutableListOf()

    fun addView(view: View) {
        listViews.add(view)
    }

    fun getViews(): MutableList<View> {
        return listViews
    }
}