package zkanonymizer;

import org.apache.zookeeper.CreateMode;

import org.apache.zookeeper.ZooDefs;




import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;

public class ZkAnonymizerApp {
    private static List<ServerNode> serverNodes;
    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        serverNodes = new ArrayList<>();
    }
}
