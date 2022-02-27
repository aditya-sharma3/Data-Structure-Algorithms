#include<iostream>
using namespace std;

void display(int list[], int size)
{
    for (int i=0; i<size; i++)
        cout<<list[i]<<" ";
    cout<<endl;
}

// bubble sort funcion
void bubbleSort(int list[], int size)
{
    for(int i=0; i<size; i++)
    {
        for(int j=0; j<size-i-1; j++)
        {
            if(list[j] > list[j+1])
            // swapping
            {
                list[j] = list[j] + list[j+1];
                list[j+1] = list[j] - list[j+1];
                list[j] = list[j] - list[j+1];
            }
        }
    }
    
}

//driver code
int main()
{
    int list[] = {4, 5, 7, 0, 2 , 3, 10, 9, 8, 1};
    int size = 10;
    cout<<"List before sorting: ";
    display(list, size);
    
    bubbleSort(list, size);

    cout<<"list After sorting: ";
    
    display(list, size);
       
    return 0;
}