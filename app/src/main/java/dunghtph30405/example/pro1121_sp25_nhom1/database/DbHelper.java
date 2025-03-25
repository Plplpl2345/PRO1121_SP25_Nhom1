package dunghtph30405.example.pro1121_sp25_nhom1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "LapMarket", null, 44);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String account = "CREATE TABLE ACCOUNT(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "hoten TEXT, " +
                "matkhau TEXT," +
                "email TEXT," +
                "loaitaikhoan TEXT," +
                "sodienthoai TEXT)";
        db.execSQL(account);

        db.execSQL("INSERT INTO ACCOUNT (hoten, matkhau, email, loaitaikhoan, sodienthoai) VALUES " +
                "('admin', 'admin', 'admin@gmail.com', 'admin', '01234567')," +
                "('user1', 'user1', 'user1@gmail.com', 'user', '0353254865')," +
                "('ngocdang', 'ngocdang02', 'ngocdang1902@gmail.com', 'user', '0322440200')," +
                "('user2', 'user2', 'user2@gmail.com', 'user', '012365489')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       if (oldVersion != newVersion){
           db.execSQL("drop table if exists ACCOUNT");
           onCreate(db);
       }
    }
    public void resetLocalData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("HOADON", null, null);
        db.delete("GIOHANG", null, null);
    }
}
