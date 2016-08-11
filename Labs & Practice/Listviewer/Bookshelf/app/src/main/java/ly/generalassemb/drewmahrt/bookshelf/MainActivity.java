package ly.generalassemb.drewmahrt.bookshelf;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Requirements
//
//        Make a ListView display sorted books
//        Show title, author, and year for each list item (first text should be the item being sorted)
//        On launch, the book shelf must be sorted by title
//        Allow the user to sort by title, year, or author
//        Custom comparators must be used to resort based on the currently selected sort

public class MainActivity extends AppCompatActivity {
    BaseAdapter mTitleAdapter;
    //TODONE: Define your other Adapters
    BaseAdapter mAuthorAdapter;
    BaseAdapter mYearAdapter;

    //TODONE: Define your ListView
    ListView listView = (ListView) findViewById(R.id.list_view);

    //TODONE: Define your Book List
    LinkedList<String> mBookList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODONE: Instantiate List
        mBookList.equals(generateBooks());

        //TODONE: Instantiate BaseAdapters for year, author, title
        //Below is a partially complete example for one Adapter
        mTitleAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return mBookList.size();
            }

            @Override
            public Object getItem(int position) {
                return mBookList.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;

                if (convertView == null) {
                    LayoutInflater li = (LayoutInflater) MainActivity.this
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = li.inflate(R.layout.book_list_item, null);
                }

                TextView textView1 = (TextView) v.findViewById(R.id.text1);
                //TODONE: Get other TextViews
                TextView textView2 = (TextView) v.findViewById(R.id.text2);
                TextView textView3 = (TextView) v.findViewById(R.id.text3);

                textView1.setText("Title: " + mBookList.get(position).getTitle());
                //TODONE: Set text for other TextViews
                textView2.setText("Author: " + mBookList.get(position).getAuthor());
                textView3.setText("Year: "+ mBookList.get(position).getYear());

                return v;
            }
        };
        mAuthorAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return mBookList.size();
            }

            @Override
            public Object getItem(int position) {
                return mBookList.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;

                if (convertView == null) {
                    LayoutInflater li = (LayoutInflater) MainActivity.this
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = li.inflate(R.layout.book_list_item, null);
                }

                TextView textView1 = (TextView) v.findViewById(R.id.text1);
                //TODONE: Get other TextViews
                TextView textView2 = (TextView) v.findViewById(R.id.text2);
                TextView textView3 = (TextView) v.findViewById(R.id.text3);

                textView1.setText("Title: " + mBookList.get(position).getTitle());
                //TODONE: Set text for other TextViews
                textView2.setText("Author: " + mBookList.get(position).getAuthor());
                textView3.setText("Year: "+ mBookList.get(position).getYear());

                return v;
            }
        };
        mYearAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return mBookList.size();
            }

            @Override
            public Object getItem(int position) {
                return mBookList.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;

                if (convertView == null) {
                    LayoutInflater li = (LayoutInflater) MainActivity.this
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = li.inflate(R.layout.book_list_item, null);
                }

                TextView textView1 = (TextView) v.findViewById(R.id.text1);
                //TODONE: Get other TextViews
                TextView textView2 = (TextView) v.findViewById(R.id.text2);
                TextView textView3 = (TextView) v.findViewById(R.id.text3);

                textView1.setText("Title: " + mBookList.get(position).getTitle());
                //TODONE: Set text for other TextViews
                textView2.setText("Author: " + mBookList.get(position).getAuthor());
                textView3.setText("Year: "+ mBookList.get(position).getYear());

                return v;
            }
        };


        //TODO: Set listeners for buttons

    }

    //Method to generate a list of Books
    private List<Book> generateBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Apples Book", "Brad", "1950"));
        books.add(new Book("Cats Book", "Ryan", "1920"));
        books.add(new Book("Eagles Book", "Kate", "1987"));
        books.add(new Book("Strawberries Cathy", "Brad", "1982"));
        books.add(new Book("Dogs Book", "Tom", "2005"));
        books.add(new Book("Ants Book", "Zane", "2001"));

        return books;
    }
}
