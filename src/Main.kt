fun main() {
    val pageVisits = mutableListOf<PageVisit>()

    logPageAccess("Home")
    logPageAccess("About")
    logPageAccess("About")
    logPageAccess("Login")
    logPageAccess("Contact")
    logPageAccess("Home")
    logPageAccess("Home")
    logPageAccess("About")
    logPageAccess("About")
    logPageAccess("Login")
    logPageAccess("Contact")
    logPageAccess("Home")

        val top5 = getTop5MostVisited()
        println("Top 5 Most Visited Pages:")
        top5.forEach { page -> println("${page.webpage}:${page.count} ") }



}

data class PageVisit(val webpage: String, var count: Int)

val pageVisits = mutableListOf<PageVisit>()

fun logPageAccess(webpage: String) {
    val existingPage = pageVisits.find { it.webpage == webpage }
    if (existingPage!= null) {
        existingPage.count++
    } else {
        pageVisits.add(PageVisit(webpage, 1))
    }
}

fun getTop5MostVisited(): List<PageVisit> {
    return pageVisits.sortedByDescending { it.count }.take(5)
}


