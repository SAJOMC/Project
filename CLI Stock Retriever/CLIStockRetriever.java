

ublic class Main {
        public static void main(String[] args) {




        URL url = new URL('https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=I81VR1KXCLK4EZ3S')
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        conn.SetRequestMethod("GET");

        r = request.get(url)
        data = r.json()
        System.out.println(data);

        int status = con.getResponseCode();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to The ClI Stock Retriever");
        System.out.println("What ticker would you like info on?");
        Symbol = scanner.next();

        int status = con.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();



    }
}


