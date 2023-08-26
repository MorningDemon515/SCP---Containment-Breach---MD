
Include "Source Code\BlitzEncode.bb"

Function MDText(x%, y%, txt$, xPos% = 0, yPos% = 0, a# = 1.0)
	Local oldr% = ColorRed() : Local oldg% = ColorGreen() : Local oldb% = ColorBlue()
	Color oldr*a,oldg*a,oldb*a
	Blitz_Text x,y,txt,xPos,yPos
	Color oldr,oldg,oldb
	Return ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function MDSetFont(Font%)
	ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function MDLoadFont%(file$,height)
	Return 
End Function

Function MDStringHeight%(txt$)
	Return ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function MDStringWidth%(txt$)
	Return ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function Text(x%, y%, txt$, xPos% = 0, yPos% = 0, a# = 1.0)
	Local oldr% = ColorRed() : Local oldg% = ColorGreen() : Local oldb% = ColorBlue()
	Color oldr*a,oldg*a,oldb*a
	Blitz_Text x,y,txt,xPos,yPos
	Color oldr,oldg,oldb
	Return 
End Function
;~IDEal Editor Parameters:
;~C#Blitz3D