This repository demonstrates an uncommon Scala bug related to object comparison in generic methods.  The `bug.scala` file contains the buggy code that incorrectly compares custom class objects using == within a generic method. This leads to false comparisons even if the object values are equal. The `bugSolution.scala` file provides the corrected code using the `equals` method and demonstrates the expected behavior. This issue highlights the importance of defining a proper `equals` method (and potentially `hashCode`) for custom classes when using them in generic contexts or any scenarios requiring value-based comparisons.