class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] arr = nums1.clone();
        Arrays.sort(arr);
        return canForm(arr, 0) || canForm(arr, 1);
    }

    private boolean canForm(int[] arr, int t) {
        int oddCount = 0, evenCount = 0;
        for (int x : arr) {
            int p = x & 1;
            if (p != t) {
                int need = p ^ t; // parity of a smaller element needed to subtract
                if (need == 1) {
                    if (oddCount == 0) return false;
                } else {
                    if (evenCount == 0) return false;
                }
            }
            if (p == 1) oddCount++; else evenCount++;
        }
        return true;
    }
}