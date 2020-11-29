import os 

def cleanDirectory(path):
    for each in os.listdir(path):
        if ".class" in each:
            os.remove(path + "/" + each)

def recursiveClean(path):
    cleanDirectory(path)
    for each in os.listdir(path):
        if os.path.isdir(path+"/"+each):
            recursiveClean(path+"/"+each)
    
if __name__ == "__main__":
    cwd = os.getcwd()
    recursiveClean(cwd)