#include <iostream>
#include <stack>
 
int main()
{
    std::stack<std::string> stack;
    if(stack.empty())
    {
        std::cout << "false" << std::endl;
    }
    std::cout << "s size: " << stack.size() << std::endl;
}