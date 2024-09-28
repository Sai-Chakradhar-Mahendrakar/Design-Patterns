import os

def print_directory_tree(startpath):
    for root, dirs, files in os.walk(startpath):
        level = root.replace(startpath, '').count(os.sep)
        indent = ' ' * 4 * level
        print(f"{indent}{os.path.basename(root)}/")
        subindent = ' ' * 4 * (level + 1)
        for file in files:
            print(f"{subindent}{file}")

# Specify the path of the directory
path = 'C:\Chakri\SRM\SEM\SEM-7\System Design\Code\JAVA\Task\ChainOfResponsibilityMethod'
print_directory_tree(path)
