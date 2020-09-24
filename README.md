# trainning



## Sort

https://careerkarma.com/blog/java-selection-sort/

```java
class SelectionSort {
	void sortNumbers(int array[]) {
		int size = array.length;

		for (int item = 0; item < size - 1; item++) {
			int minimum = item;
			for (int number = minimum + 1; number < size; number++) {
				if (array[number] < array[minimum]) {
					minimum = number;
				}
			}
			
			int temporary = array[item];
			array[item] = array[minimum];
			array[minimum] = temporary;
		}
	}
}

```



https://careerkarma.com/blog/java-quicksort/

```java
int prepare(int numbers[], int low, int high) {
	int pivot = numbers[high];
	int item = low - 1;

	for (int i = low; i < high; i++) {
		if (numbers[i] <= pivot) {
			item++;
			int swap = numbers[item];
			numbers[item] = numbers[i];
			numbers[i] = swap;
		}
	}

	int swap = numbers[item + 1];
	numbers[item + 1] = numbers[high];
	numbers[high] = swap;
	return (item + 1);
}

void sorting(int numbers[], int low, int high) {
	if (low < high) {
		int pivot = prepare(numbers, low, high);

		sorting(numbers, low, pivot - 1);
		sorting(numbers, pivot + 1, high);
	}
}

public static void main(String args[]) {
	int[] numbers = { 12, 8, 3, 1, 0, 5 };
	int to_sort = numbers.length;

	QuickSort new_sort = new QuickSort();
	new_sort.sorting(numbers, 0, to_sort - 1);
	
	System.out.println(Arrays.toString(numbers));
}

```



https://careerkarma.com/blog/java-bubble-sort/

```java
class BubbleSort {
	void sortNumbers(int array[]) {
		int size = array.length;

		for (int item = 0; item < size - 1; item++) {
			for (int j = 0; j < size - item - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temporary = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temporary;
				}
			}
		}
	}
}
```

https://careerkarma.com/blog/java-stack/

https://careerkarma.com/blog/java-copy-array/

https://careerkarma.com/blog/java-priorityqueue/



## Search

https://careerkarma.com/blog/binary-search-java/

```java
class BinarySearch {
	int searchItems(int array[], int searchingFor, int low, int high) {
		if (high >= low) {
			int middle = low + (high - low) / 2;
	
		if (array[middle] == searchingFor) {
				return middle;
			} else if (array[middle] < searchingFor) {
				searchItems(array, searchingFor, middle + 1, high);
			} else {
				searchItems(array, searchingFor, low, middle - 1);
			}
		}
		return -1;
	}
}
```







