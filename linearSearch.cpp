#include<iostream>
using namespace std;

int linearSearch(int list[], int size, int key)
{
    for(int i=0; i<size; i++)
    {
        if(list[i] == key)
            return i;
    }

    return -1;
}

// Driver code
int main()
{
    int list[] = {12, 6, 3, 7,89, 90};
    int size = 6, key;
    
    cout<<"The list is as follows: "<<endl;
    for(int i=0; i<size; i++)
    {
        cout<<list[i]<<endl;
    }
    cout<<"Enter key to search ";
    cin >> key;

    int index = linearSearch(list, size, key);
    
    if(index == -1)
        cout<<"The element is not present..."<<endl;
    else    
        cout<<"The element is present at "<<index<<endl;
    

}