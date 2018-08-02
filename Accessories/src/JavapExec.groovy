import javax.swing.JFileChooser

javapPath = "\"C:\\Program Files\\Java\\jdk-10.0.1\\bin\\javap\""

startPath = "E:\\Work\\JvmLanguagePrototype\\target\\classes\\src"

JFileChooser fc = new JFileChooser(startPath)
fc.setFileSelectionMode(JFileChooser.FILES_ONLY)
result = fc.showOpenDialog()

if(result != JFileChooser.APPROVE_OPTION){
    System.err.println("File not choosed")
    return
}

classPath = fc.getSelectedFile().getAbsolutePath()

command = javapPath + " -v " + classPath

print (command.execute().text)

