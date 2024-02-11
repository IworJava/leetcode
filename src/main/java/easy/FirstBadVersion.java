package easy;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out
 * the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether
 * version is bad. Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 * Constraints:
 * 1 <= bad <= n <= 2^31 - 1
 */
public class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int firstBadVersion) {
        super(firstBadVersion);
    }

    /**
     * 40 ms, 40.23 MB
     */
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

class VersionControl {

    private final int firstBadVersion;

    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    protected boolean isBadVersion(int n) {
        return n >= firstBadVersion;
    }
}
