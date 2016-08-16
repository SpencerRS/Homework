package ly.generalassemb.drewmahrt.bookshelf;

import java.util.Comparator;

/**
 * Created by drewmahrt on 12/16/15.
 */
public class ComparatorAuthor implements Comparator<Book> {

    @Override
    public int compare(Book lhs, Book rhs) {
        //TODONE: Write the comparison for the authors
        return lhs.getAuthor().compareTo(rhs.getAuthor());
    }
}