def problem1(name: String):String = name match {
  case s if s == null || s.isEmpty => "n/a"
  case _ => name
}

def problem2a(amount: Double):String = {
  if (amount > 0.0)
    "greater"
  else if (amount == 0.0)
    "same"
  else
    "less"
}


def problem2b(amount: Double):String = amount match {
  case a if a > 0.0 => "greater"
  case 0.0          => "same"
  case _            =>  "less"
}

def problem3(color: String): Int = color.toLowerCase match {
  case "cyan" => 0x00FFFF
  case "magenta" => 0xFF00FF
  case "yellow" =>  0xFFFF00
  case _ =>  throw new IllegalArgumentException(s"$color is not a valid selection")
}




