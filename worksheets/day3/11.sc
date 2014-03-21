
def get(hashMap: Map[Int, String], key: Int) =
  if(hashMap.contains(key)) hashMap.apply(key) else null

def concat(s1: String, s2: String): String =
  if(s1 == null) s2 else if (s2 == null) s1 else s1 + s2

concat("s1", "s2")
concat(null, "s2")
concat("s1", null)


