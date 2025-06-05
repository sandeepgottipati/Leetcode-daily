class Solution(object):

    def smallestEquivalentString(self, s1, s2, baseStr):
        """
        :type s1: str
        :type s2: str
        :type baseStr: str
        :rtype: str
        """
    
        parent = list(range(26))
        def find(x):
            if parent[x] != x:
                parent[x] = find(parent[x])
            return parent[x]
        
        for c1, c2 in zip(s1, s2):
            x, y = ord(c1) - ord('a'), ord(c2) - ord('a')
            root_x, root_y = find(x), find(y)
            if root_x < root_y:
                parent[root_y] = root_x
            elif root_y < root_x:
                parent[root_x] = root_y
        
        result = []
        for c in baseStr:
            root = find(ord(c) - ord('a'))
            result.append(chr(root + ord('a')))
        
        return ''.join(result)

        