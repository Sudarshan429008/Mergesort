
class Mergesort
{
 
	public static void main(String[] args)
    {
      int[] numbers = { 3, 8, 25,17, 5, 23, 12, 9, 66, 44 };
      int len = 10;


      MergeSort(numbers, 0, len - 1);
      for (int i = 0; i < 9; i++)
          System.out.println(numbers[i]);
    }
	
	
	 static public void MergeSort(int [] numbers, int left, int right)
	    {
	      int mid;
	    
	      if (right > left)
	      {
	        mid = (right + left) / 2;
	        MergeSort(numbers, left, mid);
	        MergeSort(numbers, (mid + 1), right);
	    
	        Merge(numbers, left, (mid+1), right);
	      }
	    }
	
	
      static public void Merge(int [] numbers, int left, int mid, int right)
      {
        int [] element = new int[25];
        int i, left_end, num_elements, array;
    
        left_end = (mid - 1);
        array = left;
        num_elements = (right - left + 1);
    
        while ((left <= left_end) && (mid <= right))
        {
            if (numbers[left] <= numbers[mid])
                element[array++] = numbers[left++];
            else
                element[array++] = numbers[mid++];
        }
    
        while (left <= left_end)
            element[array++] = numbers[left++];
 
        while (mid <= right)
            element[array++] = numbers[mid++];
 
        for (i = 0; i < num_elements; i++)
        {
            numbers[right] = element[right];
            right--;
        }
    }
 
  
    
       
    }

