package git.artdeell.aw4c;

public class Locale {
    private static final String[] STRINGS = new String[29];
    public static final int Q_STAT_SET = 0;
    public static final int Q_CURRENCY = 1;
    public static final int Q_NO_CURRENCY = 2;
    public static final int Q_DENIED = 3;
    public static final int Q_DATA_REFRESHED= 4;
    public static final int Q_ACTIVATED= 5;
    public static final int G_EXCEPTION = 6;
    public static final int C_RUNNING = 7;
    public static final int C_CANDLE_PRINT_REGULAR = 8;
    public static final int C_CONVERSION_FAILED = 9;
    public static final int C_CANDLE_PRINT_SEASON = 10;
    public static final int F_FRIEND_QUERY_FAILED = 11;
    public static final int G_C_FAILED_RETRYING = 12;
    public static final int G_C_FAILED = 13;
    public static final int G_C_DONE = 14;
    public static final int G_C_CANTREAD = 15;
    public static final int SS_NO_LIST = 16;
    public static final int SS_CURRENCY_STRING= 17;
    public static final int SS_NO_ENTRYPOINT = 18;
    public static final int W_FAILED = 19;
    public static final int W_DONE = 20;
    public static final int L_LOAD_FAILED = 21;
    public static final int D_OK = 22;
    public static final int D_FAILED = 23;
    public static final int E_P1 = 24;
    public static final int E_P2 = 25;
    public static final int E_P3= 26;
    public static final int E_PRINT_C = 27;
    public static final int E_PRINT_W = 28;
    static {
        STRINGS[Q_STAT_SET] = "Quest stat set: %s";
        STRINGS[Q_CURRENCY] = "%s (%d seasonals, %d candles)";
        STRINGS[Q_NO_CURRENCY] = "No currency response";
        STRINGS[Q_DENIED] = "Quest denied";
        STRINGS[Q_DATA_REFRESHED] = "Quest data refreshed: %s";
        STRINGS[Q_ACTIVATED] = "Quests activated!";
        STRINGS[G_EXCEPTION]= "An error has occured\n%s";
        STRINGS[C_RUNNING] = "Running for candles...";
        STRINGS[C_CANDLE_PRINT_REGULAR] = "Candles: %d";
        STRINGS[C_CONVERSION_FAILED] = "Failed to convert candles: %s";
        STRINGS[C_CANDLE_PRINT_SEASON] = "Seasonal candles: %d";
        STRINGS[F_FRIEND_QUERY_FAILED] = "Failed to read friend list";
        STRINGS[G_C_FAILED_RETRYING] = "Failed to collect %d due to %s";
        STRINGS[G_C_FAILED] = "Failed to collect %d";
        STRINGS[G_C_DONE] = "Collected %d";
        STRINGS[G_C_CANTREAD] ="Failed to read incoming gifs";
        STRINGS[SS_NO_LIST] = "Can't find the list";
        STRINGS[SS_CURRENCY_STRING] = "%d %s (spass:%s)";
        STRINGS[SS_NO_ENTRYPOINT] = "Can't find the start of the list";
        STRINGS[W_FAILED] = "Failed to collect WL";
        STRINGS[W_DONE] = "Successfully collected %d winged lights out of %d, missing lights: %s";
        STRINGS[L_LOAD_FAILED] = "Failed to load WL list";
        STRINGS[D_FAILED] = "Failed to drop lights";
        STRINGS[D_OK] = "Dropped %d lights";
        STRINGS[E_P1] = "Sacrificing your lights...";
        STRINGS[E_P2] = "Materializing your sacrifices...";
        STRINGS[E_P3] = "Returning your light...";
        STRINGS[E_PRINT_C]  = "Edem candles: %d";
        STRINGS[E_PRINT_W] = "Edem wax: %d";
    }
    public static String get(int i) {
        return STRINGS[i];
    }
    public static String get(int i, Object... va) {
        return String.format(STRINGS[i], va);
    }
}
