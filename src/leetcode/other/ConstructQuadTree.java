package leetcode.other;

public class ConstructQuadTree {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;
        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
    public Node construct(int[][] grid) {
        return helper(grid, 0 , 0 , grid.length);
    }
    private Node helper(int[][] grid , int x , int y , int length ){
        if(length==1)return new Node(grid[x][y]!=0 , true );

        Node root = new Node();
        int mid = length/2 ;
        Node topLeft = helper(grid, x, y , mid);
        Node topRight = helper(grid , x , y+mid , mid);
        Node bottomLeft= helper(grid,x+mid, y ,mid);
        Node bottomRight =helper(grid, x+mid , y+mid , mid);
        if(topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val && topRight.val== bottomLeft.val && bottomLeft.val == bottomRight.val){
            root.isLeaf = true;
            root.val = topLeft.val;
        }
        else{
            root.topLeft= topLeft;
            root.topRight= topRight;
            root.bottomLeft =bottomLeft;
            root.bottomRight = bottomRight;
        }
        return root;
    }
}
