//program to implement a concurrent web crawler that crawls multiple websites simultaneously using threads.

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    private static final int MAX_DEPTH = 2; // Maximum depth for crawling
    private static final int THREAD_POOL_SIZE = 5; // Number of threads

    private Set<String> visitedUrls = new HashSet<String>();
    private ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    public void startCrawling(String startUrl, int currentDepth) {
        if (currentDepth > MAX_DEPTH || visitedUrls.contains(startUrl)) {
            return;
        }

        visitedUrls.add(startUrl);
        executorService.execute(new WebPageCrawler(startUrl, currentDepth));
    }

    public void shutdown() {
        executorService.shutdown();
    }

    private class WebPageCrawler implements Runnable {
        private String url;
        private int depth;

        public WebPageCrawler(String url, int depth) {
            this.url = url;
            this.depth = depth;
        }

        @Override
        public void run() {
            System.out.println("Crawling " + url + " at depth " + depth);
            // Implement your web crawling logic here

            // For demonstration purposes, let's assume a simple delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Fetch links from the web page and start crawling each link
            Set<String> links = getLinksFromPage(url);
            for (String link : links) {
                startCrawling(link, depth + 1);
            }
        }

        private Set<String> getLinksFromPage(String url) {
            // Implement logic to fetch links from the web page
            // This could involve using a library like Jsoup or HttpClient

            // For demonstration purposes, returning a dummy set of links
            Set<String> dummyLinks = new HashSet<String>();
            dummyLinks.add("https://google.com/link1");
            dummyLinks.add("https://google.com/link2");
            return dummyLinks;
        }
    }

    public static void main(String[] args) {
        Main webCrawler = new Main();
        webCrawler.startCrawling("https://google.com", 0);

        // Allow some time for crawling
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webCrawler.shutdown();
    }
}
